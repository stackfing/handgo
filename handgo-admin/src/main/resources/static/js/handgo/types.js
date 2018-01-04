function zTreeOnClick(event, treeId, treeNode) {
    // alert(treeNode.id);
    $.ajax({ url: "/admin/types/" + treeNode.id, context: document.body, success: function(data){
            // alert(data.name);
            $("#typeName").attr('value', data.name);
            if (data.parent != null) {
                $("#isParent").attr('value', '否');
            } else {
                $("#isParent").attr('value', '是');
            }
            $("#isClosed").attr('value', '是');
            $("#typeId").attr('value', data.id);

        }});
};

var zTreeObj;
// zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
var setting = {
    async: {
        enable: true,
        url: "/admin/types/allRoot",
        type: "get",
        autoParam:["id"]
    },
    callback: {
        onClick: zTreeOnClick
    },
    view: {
        showLine: false
    }
};

var types;
// zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
var zNodes = types;

$(document).ready(function(){
    zTreeObj = $.fn.zTree.init($("#typeTree"), setting, zNodes);
});

var layedit;
layui.use('layedit', function(){
    layedit = layui.layedit;
    layedit.build('demos'); //建立编辑器
});

$(document).ready(function(){
    var row2 = {'id':'null','name':'null','pId':'null','parent': 'null'};
    var forms = new FormData(document.getElementById("types"));
    $("#handgoSubmit").bind("click",
        function() {
            $.ajax({url: "/admin/types",
                type: "post",
                contentType:"application/json",
                dataType: 'json',
                data: row2,
                success: function (data) {
                    if (data == "ok") {
                        alert("ok");
                    }
                }})
        });
});