$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://www.cardinaltalent.ai/users/sign_in\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Email as \"sadanandkothari9@gmail.com\" and Password as \"Pass@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on signIn button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_signIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User varify page title should be \"People Searches | CardinalTalent\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_varify_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on logOut link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_click_on_logOut_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User varify page title should be \"Welcome | CardinalTalent\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_varify_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});