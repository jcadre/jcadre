/**
 * 实现认证和授权的管理操作
 */
package com.jcadre.realm;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.jcadre.domain.ShiroUser;
import com.jcadre.domain.User;
import com.jcadre.service.IUserService;

/**
 * 实现认证和授权的管理操作
 * @author JC
 * 2017年3月22日
 */
public class CommonRealm extends AuthorizingRealm {
	
	@Resource
	private IUserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		ShiroUser shiroUser = (ShiroUser) principals.fromRealm(getName()).iterator().next();  
        User user = userService.findUserByLoginName(shiroUser.getLoginName());  
        //基于Permission的权限信息  
        if (user != null) {  
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();  
            /* for (Role role : user.getRoles()) {  
                 for(Permission permission: role.getPermisssions()){  
                     info.addStringPermission(permission.getValue());  
                 }  
             }  */
            return info;  
        } else {  
            return null;  
        }  
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String loginName = token.getUsername();
		String password = new String(token.getPassword());
        User user = userService.checkPwd(loginName, password);
        if (user != null) {  
            return new SimpleAuthenticationInfo(new ShiroUser(user.getLoginName(), user.getNickName()), user.getPassword(), getName());  
        } else {  
            return null;  
        }  
	}

}
