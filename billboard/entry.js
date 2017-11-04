import {bb} from "billboard.js";

var chart = bb.generate({
  bindto: "#chart",
  data: {
    type: "bar",
    columns: [
      ["data1", 30, 200, 100, 170, 150, 250],
      ["data2", 130, 100, 140, 35, 110, 50]
    ]
  }
});

module.exports = chart;
