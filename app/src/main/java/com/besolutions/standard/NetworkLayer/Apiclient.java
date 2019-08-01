package com.besolutions.standard.NetworkLayer;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Apiclient {

    /**
     * @API
     *
     * ---> 1) URL OF API METHOD
     *
     * ---> 2) ARRAY OF PARAMETERS KEYS
     *
     */

    LOGIN_USER("login_user?", Arrays.asList("email", "pass")),
    LOGIN_INVESTOR("login_investor?",Arrays.asList("email", "pass")),
    INSERT_USER("insert_user?",Arrays.asList("Name","Email","Password","Age","Gender","Work","Mobile","Images","Identification","Account_statement")),
    INSERT_INVESTOR("insert_investor?",Arrays.asList("Name","Email","Password","Age","Gender","Work","Mobile","Images")),
    INSERT_PRODUCT("insert_product?",Arrays.asList("Title","Images","Price","Price_Agaal","Details","id_member","number")),
    REQUEST_PRODUCT("request_product?",Arrays.asList("id_user","id_product","id_investor","date","status","cost","day","mouth","year","numberitems")),
    SELECT_INVESTORS("selecte_all_investors", Collections.singletonList("id_member")),
    SELECT_MY_REQUESTS("selecte_my_request?", Collections.singletonList("id_user")),
    SELECT_USER("select_all_data_user?", Collections.singletonList("id_user")),
    SELECT_MY_REQUESTS_INVESTOR("selecte_my_request_invistor?", Collections.singletonList("id_investor")),
    SELECT_PRODUCTS("selecte_product_bymember?", Collections.singletonList("id_member")),
    SELECT_MY_INSTALLMENTS("selecte_my_installment?", Collections.singletonList("id_user")),
    SELECT_ADV_1("select_adv_1", null),
    SELECT_ADV_2("select_adv_2", null),
    SELECT_ADV_3("select_adv_3", null),
    SELECT_ADV_4("select_adv_4", null),
    UPDATE_RATE("update_rate?",Arrays.asList("number_rate","number_star","id_user")),
    UPDATE_INSTALLMENT("update_installment?",Arrays.asList("id","status")),
    UPDATE_USER("update_user?",Arrays.asList("id","Name","Email","Password","Age","Gender","Work","Mobile","Images","Identification","Account_statement")),
    UPDATE_INVESTOR("update_investor?",Arrays.asList("id","Name","Email","Password","Age","Gender","Work","Mobile","Images"));



    //--------------------------------------

    /**
     * @BASE_URL
     */

    String BASE_URL = "http://token.technowow.net/token.asmx/";

    private final String URL;
    private final List<String> params;


    Apiclient(String URL, List<String> params) {

        this.URL = URL;
        this.params = params;
    }

    public String getURL() {
        return BASE_URL + URL;
    }

    public List<String> getParams() {
        return params;
    }
}
