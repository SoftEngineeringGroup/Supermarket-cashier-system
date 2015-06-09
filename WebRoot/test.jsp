
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset="utf-8" />
<title>lightBox V.10</title>
<style type="text/css">
html,body{ height:100%; padding:0; margin:0; font:normal 12px/22px Arial, Helvetica, sans-serif;}
.row{ margin:5px 0;}
input.input,textarea{ padding:5px; border:solid 1px #bbb; width:70%;font:normal 12px/150% Arial, Helvetica, sans-serif;}
textarea{ height:80px;}
b.label{ width:18%; float:left; display:inline-block;margin:6px 15px 0;}
.Boxheader,.Boxfooter,.Boxbody{ position:relative;}

.headerR,.FooterR,.BodyR{ float:left;width:20px; }
.headerL,.FooterL,.BodyL{ float:left;}

.headerR{background:url(lightbox-header.png) no-repeat right 0; height:46px;}
.headerL{background:url(lightbox-header.png) no-repeat left 0; height:46px;padding:0 0 0 20px;}

.FooterR{background:url(lightbox-footer.png) no-repeat right 0;height:59px;}
.FooterL{background:url(lightbox-footer.png) no-repeat left 0;height:39px;padding:10px 0 10px 20px;}



.BodyL{background:url(lightbox-body.png) repeat-y left 0;padding:10px 0 10px 20px;}
.BodyR{background:url(lightbox-body.png) repeat-y right 0;}

.BoxMask{ height:100%; width:100%;left:0; top:0; background:#000;opacity:0.25;filter:alpha(opacity=25);}

.Boxfooter{height:59px; }
.Boxbody{overflow:hidden;}
.Boxheader{ height:46px;cursor:move; }
.Boxfooter .btn{ display:inline-block; float:right; margin:10px 10px 0 0;}
</style>
</head>

<body>
告诉你一个应有尽有的网页特效网址：<a href="http://js.alixixi.com">http://js.alixixi.com</a>
<hr />
<script type="text/javascript" src="lightBox.js"></script>
<script type="text/javascript">
var html1='<h3><a href="http://www.52cpp.com">www.52cpp.com</a></h3><p><img src="http://www.52cpp.com/THEMES/Vista/STYLE/images/M-bg.jpg" border=0 /></p>';
var html2 = '<div class="row"><b class="label"><font color="red">*</font>Your Email:</b><input type="text" value="abc" class="input" /></div>';
	html2+='<div class="row"><b class="label"><font color="red">*</font>Subject:</b><input type="text" value=" Work at Home: Real Work, Real Pay!" class="input" /></div>';
	html2+='<div class="row"><b class="label"><font color="red">*</font>Message:</b><textarea wrap="soft"></textarea></div>';
var html3 = '<iframe src="http://www.baidu.com/" width=800 height=400 frameborder="0"></iframe>';
var html6 = '<iframe src="http://bj.58.com/" width=800 height=400 frameborder="0"></iframe>';
var footerhtml6='<span style="float:right;color:#FFcccc;position:relative;display:block;width:100px;">Copyright 2009<span style="color:#333;position:absolute;left:-1px;top:-1px;">Copyright 2009</span>';


var footerhtml4='<input type="image" alt="Cancel" src="send_button.gif" class="btn" onclick=alert("Sumbited!"); />';
	footerhtml4+='<input type="image" alt="Cancel" src="cancel_button.gif" class="btn" id="msg4cancel" />';
var	footerhtml3='<input type="image" alt="Cancel" src="cancel_button.gif" class="btn" id="msg3cancel" />';
var	footerhtml2='<input type="image" alt="Cancel" src="cancel_button.gif" class="btn" id="msg2cancel" />';
var	footerhtml1='<input type="image" alt="Cancel" src="cancel_button.gif" class="btn" id="msg1cancel" />';	


</script>
<a href="#" onclick='Box("msg1",600,300,html1,footerhtml1);' style="display:block;background:green; color:#FFF; margin:100px 0 2px 0; text-align:center;">Create</a>
<a href="#" onclick='Box("msg2","400","",html2,footerhtml2);' style="display:block; background:orange; color:#FFF; margin:0 0 2px 0;text-align:center;">Create2</a>
<a href="#" onclick='Box("msg3",800,400,html3,footerhtml3);' style="display:block; background:red; color:#000; margin:0 0 2px 0;text-align:center;">Create3</a>
<a href="#" onclick='Box("msg5",10,10,"","");' style="display:block; background:darkblue; color:#FFF;margin:0 0 2px 0;text-align:center;">Create4</a>
<a href="#" onclick='Box("msg6",900,400,html6,footerhtml6);' style="display:block; background:#aaa; color:#FFF;text-align:center;">Create5</a>
</body>
</html>