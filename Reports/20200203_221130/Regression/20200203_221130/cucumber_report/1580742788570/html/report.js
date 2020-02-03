$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/robby.kurniawan30/Documents/robby/learn/appmola/Include/features/live.feature");
formatter.feature({
  "name": "Video player",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@live"
    }
  ]
});
formatter.scenario({
  "name": "Live button can be click",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@live"
    },
    {
      "name": "@player"
    }
  ]
});
formatter.step({
  "name": "User want to button live",
  "keyword": "Given "
});
formatter.match({
  "location": "scriptLive.userWanttoButtonLive()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click button live",
  "keyword": "When "
});
formatter.match({
  "location": "scriptLive.userClickButtonLive()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User direct to live page",
  "keyword": "Then "
});
formatter.match({
  "location": "scriptLive.userDirecttoLiveButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Type live can be click",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@live"
    }
  ]
});
formatter.step({
  "name": "User want to click button type live",
  "keyword": "Given "
});
formatter.match({
  "location": "scriptLive.userWantToClickButtonTypeLive()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click button type live",
  "keyword": "When "
});
formatter.match({
  "location": "scriptLive.clickButtonLive()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can be click type live",
  "keyword": "Then "
});
formatter.match({
  "location": "scriptLive.canBeClickTypeLive()"
});
formatter.result({
  "status": "passed"
});
});