function changeColor(){ 
	var color="#f00|#0f0|#00f|#880|#808|#088|yellow|green|blue|gray|#234|#534";//定义一条变换颜色的字符串
	color=color.split("|"); //然后通过split方法进行分割
 	var xuan = document.getElementsByTagName("h2");//获得元素
	for(var i=0;i<xuan.length;i++){
	xuan[i].style.color=color[parseInt(Math.random() * color.length)];//设置样式 
 
	}
	}
	setInterval("changeColor()",200);//死循环，每0.2秒变换一种颜色