package com.aspire.seedbank.utilities;

public class Query {
public static String SELECT_ADMIN_PASSWORD="select adminpassword,adminname from admin where adminemail=?";
public static String SELECT_USER="select * from user where userid=?";
public static String INSERT_USER_PERSONAL_DETAILS="insert into user values(?,?,?,?,?,?,?,?)";
public static String INSERT_USER_ACCOUNT_DETAILS="insert into useraccount values(?,?,?,?,?)";
public static String SELECT_ADMIN="select * from admin where adminid=?";
public static String INSERT_ADMIN="insert into admin values(?,?,?,?,?,?,?,?)";
public static String DELETE_USER_ACCOUNT="delete from seedbank.useraccount where userid=?";
public static String DELETE_USER_PERSONAL_DETAILS="delete from seedbank.user where userid=?";
public static String UPDATE_USER_ACCOUNT="update useraccount set upiid=?,ifsc=?,branchname=? where userid=?";
public static String UPDATE_USER="update user set username=?,useremail=?,userphone=?,useraddress=?,usercity=?,userpincode=? where userid=?";
public static String UPDATE_ADMIN="update admin set adminname=?,adminemail=?,adminphone=?,adminaddress=?,admincity=?,adminpincode=? where adminid=?";
public static String DELETE_ADMIN="delete from seedbank.admin where adminid=?";
public static String SELECT_CATEGORY="select * from category where categoryid=?";
public static String INSERT_CATEGORY="insert into category values(?,?)";
public static String SELECT_SEED="select * from seed where seedid=?"; 
public static String INSERT_SEED="insert into seed values(?,?,?,?,?,?,?,?)";
public static String UPDATE_CATEGORY="update category set categoryname=? where categoryid=?";
public static String UPDATE_SEED="update seed set categoryid=?,seedname=?,temperature=?,image=?,kilogramsinstock=?,priceperkilogramdeposite=?,priceperkilogramwithdraw=? where seedid=?";    
public static String DELETE_SEED="delete from seedbank.seed where seedid=?";
public static String VIEW_ALL_USER="call viewalluser";
public static String VIEW_ALL_ADMIN="select * from admin";
public static String SELECT_USER_FOR_LOGIN="select userpassword,username,userid from user where useremail=?";
public static String SELECT_FEEDBACK="select * from feedback where feedbackid=?";
public static String INSERT_FEEDBACK="insert into feedback values(?,?,?,?,?)";
public static String INSER_DEPOSIT_TRANSACTION="insert into deposittransaction values(?,?)";
public static String INSERT_TRANSACTION="insert into transaction values(?,?,?,?,?,?)";
public static String SELECT_ACCOUNT_DETAILS="select accountnumber,ifsc from useraccount where userid=?";
public static String INSERT_DEPOSIT="insert into deposit values(?,?,?,?,?)";
public static String UPDATE_QUANTITY="update seedbank.seed set kilogramsinstock=? where seedid=?";
public static String SELECT_DEPOSIT_RATE="select kilogramsinstock,priceperkilogramdeposite from seed where seedid=?";
public static String SELECT_DEPOSIT="select * from deposit where depositid=?";
public static String SELECT_ORDER="select * from orders where orderid=?";
public static String SELECT_PRICE_WITHDRAW="select kilogramsinstock,priceperkilogramwithdraw from seed where seedid=?";
public static String INSERT_ORDER="insert into orders values(?,?,?,?,?)";
public static String INSERT_ORDER_TRANSACTION="insert into ordertransaction values(?,?)";

}
