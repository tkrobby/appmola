$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/robby.kurniawan30/Documents/robby/learn/appmola/Include/features/videoPlayer.feature");
formatter.feature({
  "name": "Video Palyer on Mola TV",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@live"
    }
  ]
});
formatter.scenario({
  "name": "Play movie on home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@live"
    },
    {
      "name": "@live"
    }
  ]
});
formatter.step({
  "name": "user want to video player page",
  "keyword": "Given "
});
formatter.match({
  "location": "video.userWantToVidepPlayerPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "scroll until movie",
  "keyword": "When "
});
formatter.match({
  "location": "video.scrollUntilMovie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select one video",
  "keyword": "And "
});
formatter.match({
  "location": "video.selectOneVideo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user direct video player page",
  "keyword": "Then "
});
formatter.match({
  "location": "video.userDirectToVideoPlayer()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Play video player",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@live"
    }
  ]
});
formatter.step({
  "name": "user click play",
  "keyword": "When "
});
formatter.match({
  "location": "video.userWantPlayMovie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "video can be play",
  "keyword": "Then "
});
formatter.match({
  "location": "video.videoCanBePlay()"
});
formatter.result({
  "status": "passed"
});
});