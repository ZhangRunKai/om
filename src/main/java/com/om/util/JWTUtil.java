package com.om.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.om.dto.UserDTO;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtil{
    public static ThreadLocal<HashMap<String,String>> userManager = new ThreadLocal<>();
    private static final String SECRET = "XX#$%()(#*!(sadsadsadqwe)!KL<><\\ED5944B6F54D2DF4967615C7D59AE70E>?N<:{LWPW";
    public static final String TOKEN_HEADER = "authentication";
    private static final Algorithm ALGORITHM = Algorithm.HMAC256(SECRET);
    private static final Long EXPIRES = 15*24*60*60*1000L;
    private static final JWTVerifier build = JWT.require(ALGORITHM).build();

    public static final String USERID = "userId";
    public static final String ROLEPOWER = "rolePower";
    public static final String ROLENAME = "roleName";
    public static final String USERNAME = "userName";

    /**
     *
     * @param user 用户信息
     * @return
     */
    public static String createToken(UserDTO user){
        return JWT.create()
                .withClaim(USERNAME, user.getUserName())
                .withClaim(USERID, user.getUserId().toString())
                .withClaim(ROLEPOWER,user.getRolePower().toString())
                .withClaim(ROLENAME,user.getRoleDescribe())
                .withExpiresAt(new Date(System.currentTimeMillis()+ EXPIRES))
                .sign(ALGORITHM);
    }


    public static HashMap<String,String> VerifierToken(String token){
        Map<String, Claim> claims = build.verify(token).getClaims();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userId",claims.get(USERID).asString());
        hashMap.put("rolePower",claims.get(ROLEPOWER).asString());
        hashMap.put("userName",claims.get(USERNAME).asString());
        hashMap.put("roleName",claims.get(ROLENAME).asString());
        return hashMap;
    }

    public static Integer getUserId(){
        return Integer.parseInt(JWTUtil.userManager.get().get(JWTUtil.USERID));
    }
    public static Integer getPower(){
        return Integer.parseInt(JWTUtil.userManager.get().get(JWTUtil.ROLEPOWER));
    }

    public static String getUserName(){
        return JWTUtil.userManager.get().get(JWTUtil.USERNAME);
    }
}

