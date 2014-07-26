React = require("react");
var classreg  = require('../out/om_tut');

/*
 * GET home page.
 */

exports.index = function(req, res){
  res.render('index', { title: 'Express', classes: classreg.getClassesHtml(), registry: classreg.getRegistryHtml() });
};