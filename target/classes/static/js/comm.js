window.comm={
	ServerUrl:"http://localhost:8080/",
	
    /**
     * 判断用户和密码是否为空
     * @param str
     * @returns {boolean}
     */
    isNotnull:function(str){
        if (str != null && str != "" && str != undefined) {
            return true;
        } else {
            return false
        }
    },

}