<%@ page language="java" import="java.util.*,org.easybooks.bookstore.vo.*,org.easybooks.bookstore.dao.impl.*,net.sf.json.JSONArray,net.sf.json.JSONObject" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>数采仪</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<!-- 重复的内容Starting -->
	
	<link href="lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
    <link href="lib/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css" />
    <link href="lib/ligerUI/skins/Gray/css/all.css" rel="stylesheet" type="text/css" />
    <script src="lib/jquery/jquery-1.4.4.min.js" type="text/javascript"></script> 
    <script src="lib/ligerUI/js/core/base.js" type="text/javascript"></script> 
    <script src="lib/ligerUI/js/plugins/ligerGrid.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerToolBar.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>
    
     <%
        System.out.println("scy.jsp starting!");
      %>
      
    <% String strArray=request.getAttribute("SCY_strJSONArray").toString(); %>
    <% String size = request.getAttribute("SCY_size").toString(); 
       int Size = Integer.parseInt(size);
    %>
	
	<script type="text/javascript">
	
    var Data = {Rows:<%=strArray %>,Total:<%=Size %>};
   
        function itemclick(item)
        {
            alert(item.text);
        }
        
        $(function ()
        {
            window['g'] =
            $("#maingrid").ligerGrid({
                height:'100%',
                columns: [
                { display: '进/排水口名称', name: 'in_out_name' },
                { display: '污染源名称', name: 'v_SCY_Ent_Name' },
                { display: '所属区县', name: 'v_SCY_region' },
                { display: '数采仪MN', name: 'v_MN_No' },
                { display: '数采仪类型', name: 'v_SCY_type' },
                { display: '状态', name: 'v_SCY_state' },
                { display: '启用日期', name: 'v_SCY_date' }
                ], data:Data,  pageSize:30 ,rownumbers:true,toolbarShowInLeft:false,
                toolbar: { items: [
                { text: '增加', click: itemclick, icon: 'add' },
                { line: true },
                { text: '修改', click: itemclick, icon: 'modify' },
                { line: true },
                { text: '删除', click: itemclick, img: 'lib/ligerUI/skins/icons/delete.gif' },
                { line:true },
                { text: '查看', click: itemclick, img: 'lib/ligerUI/skins/icons/view.gif'}
                ]
                }
            });
             

            $("#pageloading").hide();
        });

        function deleteRow()
        {
            g.deleteSelectedRow();
        }
    </script>
	
	<!-- 重复的内容End -->

  </head>
  
<body style="overflow-x:hidden; padding:2px;">
<div class="l-loading" style="display:block" id="pageloading"></div>
 <a class="l-button" style="width:120px;float:left; margin-left:10px; display:none;" onclick="deleteRow()">删除选择的行</a>

 
 <div class="l-clear"></div>

    <div id="maingrid"></div>
   
  <div style="display:none;">
  
</div>
</body>
</html>
