$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "As a user",
  "description": "",
  "id": "as-a-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5426068900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid credential",
  "description": "",
  "id": "as-a-user;login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I\u0027m on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.i_m_on_login_page()"
});
formatter.result({
  "duration": 3247778800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_enter_username_and_password()"
});
formatter.result({
  "duration": 424405200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_click_on_login()"
});
formatter.result({
  "duration": 2741664100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 243024000,
  "status": "passed"
});
formatter.after({
  "duration": 1294527500,
  "status": "passed"
});
formatter.uri("src/test/features/Receptionist .feature");
formatter.feature({
  "line": 1,
  "name": "As a Receptionist",
  "description": "",
  "id": "as-a-receptionist",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2429828900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "validate Receptionist user  is able to modify any user except admin user and update it",
  "description": "",
  "id": "as-a-receptionist;validate-receptionist-user--is-able-to-modify-any-user-except-admin-user-and-update-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter userName and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should login and get redirected to account page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on user",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on userList",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be able to modify \"Installer1\"  user",
  "keyword": "Then "
});
formatter.match({
  "location": "ReceptionistStep.i_am_in_login_page()"
});
formatter.result({
  "duration": 3073649600,
  "status": "passed"
});
formatter.match({
  "location": "ReceptionistStep.i_enter_userName_and_password()"
});
formatter.result({
  "duration": 301772300,
  "status": "passed"
});
formatter.match({
  "location": "ReceptionistStep.i_click_on_Login_button()"
});
formatter.result({
  "duration": 3009641400,
  "status": "passed"
});
formatter.match({
  "location": "ReceptionistStep.i_should_login_and_get_redirected_to_account_page()"
});
formatter.result({
  "duration": 102297700,
  "status": "passed"
});
formatter.match({
  "location": "ReceptionistStep.i_click_on_user()"
});
formatter.result({
  "duration": 155815800,
  "status": "passed"
});
formatter.match({
  "location": "ReceptionistStep.i_click_on_userList()"
});
formatter.result({
  "duration": 691075600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Installer1",
      "offset": 28
    }
  ],
  "location": "ReceptionistStep.i_should_be_able_to_modify_user(String)"
});
formatter.result({
  "duration": 457609000,
  "status": "passed"
});
formatter.after({
  "duration": 816271200,
  "status": "passed"
});
formatter.uri("src/test/features/User.feature");
formatter.feature({
  "line": 1,
  "name": "As a user",
  "description": "",
  "id": "as-a-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2377973400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I\u0027m on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on product",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on productList",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be  redirected to product page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.i_m_on_login_page()"
});
formatter.result({
  "duration": 2966407800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_enter_username_and_password()"
});
formatter.result({
  "duration": 302790300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_click_on_login()"
});
formatter.result({
  "duration": 2938921900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 271414300,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.i_click_on_product()"
});
formatter.result({
  "duration": 180861900,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.i_click_on_productList()"
});
formatter.result({
  "duration": 970421800,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.i_should_be_redirected_to_product_page()"
});
formatter.result({
  "duration": 1563036500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "I should be able to search",
  "description": "",
  "id": "as-a-user;i-should-be-able-to-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I enter into search field \"DomProduct\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on filter button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "i should be seeing only product 3 in the home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "DomProduct",
      "offset": 27
    }
  ],
  "location": "UserStep.i_enter_into_search_field(String)"
});
formatter.result({
  "duration": 121362800,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.i_click_on_filter_button()"
});
formatter.result({
  "duration": 1034358900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 32
    }
  ],
  "location": "UserStep.i_should_be_seeing_only_product_in_the_home_page(int)"
});
formatter.result({
  "duration": 50838600,
  "status": "passed"
});
formatter.after({
  "duration": 1080809900,
  "status": "passed"
});
formatter.before({
  "duration": 2342471100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I\u0027m on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on product",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on productList",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be  redirected to product page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.i_m_on_login_page()"
});
formatter.result({
  "duration": 2814529500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_enter_username_and_password()"
});
formatter.result({
  "duration": 347604700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_click_on_login()"
});
formatter.result({
  "duration": 2782624600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 115122800,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.i_click_on_product()"
});
formatter.result({
  "duration": 190161700,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.i_click_on_productList()"
});
formatter.result({
  "duration": 2411548100,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.i_should_be_redirected_to_product_page()"
});
formatter.result({
  "duration": 92154600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "I should be able to update",
  "description": "",
  "id": "as-a-user;i-should-be-able-to-update",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I click on edit in \"Product 1\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should be  redirected to edit \"product 1\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I enter new data \"one year\" in Product Warranty Details field",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I should be able to update it successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Product 1",
      "offset": 20
    }
  ],
  "location": "UserStep.i_click_on_edit_in(String)"
});
formatter.result({
  "duration": 612063900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "product 1",
      "offset": 33
    }
  ],
  "location": "UserStep.i_should_be_redirected_to_edit_page(String)"
});
formatter.result({
  "duration": 474040300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "one year",
      "offset": 18
    }
  ],
  "location": "UserStep.i_enter_new_data_in_Product_Warranty_Details_field(String)"
});
formatter.result({
  "duration": 145371100,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.i_should_be_able_to_update_it_successfully()"
});
formatter.result({
  "duration": 175854200,
  "status": "passed"
});
formatter.after({
  "duration": 901443600,
  "status": "passed"
});
});