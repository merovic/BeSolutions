package com.besolutions.standard.NetworkLayer;

import android.content.Context;

import com.android.volley.Request;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @desc Java Api Calls Contains all the Project Calls
 */

public class Apicalls {

    private APIRouter apiRouter;

    public Apicalls(Context context, NetworkInterface networkInterface) {

        apiRouter = new APIRouter(context, networkInterface);
    }

    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func User Login
     */

    public void loginUser(final String email, final String pass) {

        apiRouter.performRequest(Apiclient.LOGIN_USER.getURL(),Apiclient.LOGIN_USER.getParams(),Arrays.asList(email,pass), Request.Method.POST,0);

    }



    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Investor Login
     */

    public void loginInvestor(final String email, final String pass) {

        apiRouter.performRequest(Apiclient.LOGIN_INVESTOR.getURL(),Apiclient.LOGIN_INVESTOR.getParams(),Arrays.asList(email,pass), Request.Method.POST,1);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func User Registration
     */

    public void insertUser(final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images, final String Identification, final String Account_statement) {

        apiRouter.performRequest(Apiclient.INSERT_USER.getURL(),Apiclient.INSERT_USER.getParams(),Arrays.asList(Name,Email,Password,Age,Gender,Work,Mobile,Images,Identification,Account_statement), Request.Method.POST,2);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Investor Registration
     */

    public void insertInvestor(final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images) {

        apiRouter.performRequest(Apiclient.INSERT_INVESTOR.getURL(),Apiclient.INSERT_INVESTOR.getParams(),Arrays.asList(Name,Email,Password,Age,Gender,Work,Mobile,Images), Request.Method.POST,3);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Buy a Product
     */

    public void requestProduct(final String id_user, final String id_product, final String id_investor, final String date, final String status, final String cost, final String day, final String mouth, final String year, final String numberitems) {

        apiRouter.performRequest(Apiclient.REQUEST_PRODUCT.getURL(),Apiclient.REQUEST_PRODUCT.getParams(),Arrays.asList(id_user,id_product,id_investor,date,status,cost,day,mouth,year,numberitems), Request.Method.POST,4);

    }


    //----------------------------------------------------------------------------------------------


    /**
     *
     * @func Retrieve Investors
     */

    public void selectInvestors(final String id_member) {

        apiRouter.performRequest(Apiclient.SELECT_INVESTORS.getURL(),Apiclient.SELECT_INVESTORS.getParams(),Collections.singletonList(id_member), Request.Method.POST,5);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve Products
     */

    public void selectProducts(final String id_member) {

        apiRouter.performRequest(Apiclient.SELECT_PRODUCTS.getURL(),Apiclient.SELECT_PRODUCTS.getParams(),Collections.singletonList(id_member), Request.Method.POST,6);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve ADV1
     */

    public void selectAdv1() {

        apiRouter.performRequest(Apiclient.SELECT_ADV_1.getURL(),Apiclient.SELECT_ADV_1.getParams(),null, Request.Method.POST,16);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve ADV2
     */

    public void selectAdv2() {

        apiRouter.performRequest(Apiclient.SELECT_ADV_2.getURL(),Apiclient.SELECT_ADV_2.getParams(),null, Request.Method.POST,17);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve ADV3
     */

    public void selectAdv3() {

        apiRouter.performRequest(Apiclient.SELECT_ADV_3.getURL(),Apiclient.SELECT_ADV_3.getParams(),null, Request.Method.POST,18);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve ADV4
     */

    public void selectAdv4() {

        apiRouter.performRequest(Apiclient.SELECT_ADV_4.getURL(),Apiclient.SELECT_ADV_4.getParams(),null, Request.Method.POST,19);

    }


    //----------------------------------------------------------------------------------------------


    /**
     *
     * @func Retrieve User Requests
     */

    public void selectMyRequests(final String id_user) {

        apiRouter.performRequest(Apiclient.SELECT_MY_REQUESTS.getURL(),Apiclient.SELECT_MY_REQUESTS.getParams(), Collections.singletonList(id_user), Request.Method.POST,7);

    }


    //----------------------------------------------------------------------------------------------


    /**
     *
     * @func Update User Data
     */

    public void updateUser(final String id,final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images, final String Identification, final String Account_statement) {

        apiRouter.performRequest(Apiclient.INSERT_USER.getURL(),Apiclient.INSERT_USER.getParams(),Arrays.asList(id,Name,Email,Password,Age,Gender,Work,Mobile,Images,Identification,Account_statement), Request.Method.POST,8);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Update Investor Data
     */

    public void updateInvestor(final String id,final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images) {

        apiRouter.performRequest(Apiclient.INSERT_INVESTOR.getURL(),Apiclient.INSERT_INVESTOR.getParams(),Arrays.asList(id,Name,Email,Password,Age,Gender,Work,Mobile,Images), Request.Method.POST,9);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Update Investor Data
     */

    public void insertProduct(final String Title,final String Images, final String Price, final String Price_Agaal, final String Details, final String id_member, final String number) {

        apiRouter.performRequest(Apiclient.INSERT_PRODUCT.getURL(),Apiclient.INSERT_PRODUCT.getParams(),Arrays.asList(Title,Images,Price,Price_Agaal,Details,id_member,number), Request.Method.POST,10);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve User Requests
     */

    public void selectMyRequestsInvestor(final String id_investor) {

        apiRouter.performRequest(Apiclient.SELECT_MY_REQUESTS_INVESTOR.getURL(),Apiclient.SELECT_MY_REQUESTS_INVESTOR.getParams(), Collections.singletonList(id_investor), Request.Method.POST,11);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve Products
     */

    public void selectUser(final String id_user) {

        apiRouter.performRequest(Apiclient.SELECT_USER.getURL(),Apiclient.SELECT_USER.getParams(),Collections.singletonList(id_user), Request.Method.POST,12);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve Products
     */

    public void selectInstallments(final String id_user) {

        apiRouter.performRequest(Apiclient.SELECT_MY_INSTALLMENTS.getURL(),Apiclient.SELECT_MY_INSTALLMENTS.getParams(),Collections.singletonList(id_user), Request.Method.POST,13);

    }


    //----------------------------------------------------------------------------------------------


    /**
     *
     * @func Update Investor Data
     */

    public void updateInstallment(final String id,final String status) {

        apiRouter.performRequest(Apiclient.UPDATE_INSTALLMENT.getURL(),Apiclient.UPDATE_INSTALLMENT.getParams(),Arrays.asList(id,status), Request.Method.POST,14);

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Update Investor Data
     */

    public void updateRate(final String number_rate,final String number_star,final String id_user) {

        apiRouter.performRequest(Apiclient.UPDATE_RATE.getURL(),Apiclient.UPDATE_RATE.getParams(),Arrays.asList(number_rate,number_star,id_user), Request.Method.POST,15);

    }


    //----------------------------------------------------------------------------------------------

}
