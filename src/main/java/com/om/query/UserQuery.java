package com.om.query;

import com.om.util.Page;
import lombok.Data;

/**
 * @author zhang run kai
 * @version 1.0
 * @date 2021/6/9 21:12
 */
@Data
public class UserQuery extends Page {

    private String userAccount;

    private String userPassword;
}
