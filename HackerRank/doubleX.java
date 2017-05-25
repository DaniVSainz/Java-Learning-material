boolean doubleX(String str) {
	int secChar = str.indexOf("x") + 1;
	if ((str.indexOf("x") + 1 < str.length()) && str.indexOf("x") > -1 ){
  	if (str.charAt(str.indexOf("x")) == str.charAt(str.indexOf("x") +1  )){
  	  return true;
  	}
	}
	return false;
}
