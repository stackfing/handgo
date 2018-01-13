var form;
layui.use('form', function(){
    form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
    form.render();
});
//菜单点击事件
function zTreeOnClick(event, treeId, treeNode) {
    // alert(treeNode.id);
    $.ajax({ url: "/admin/types/" + treeNode.id, context: document.body, success: function(data){
            // alert(data.parent);
            $("#typeName").attr('value', data.name);
            $("#typeId").attr('value', data.id);
            $("#parent").attr('value', data.parent);
            if (data.isRoot == 1) {
                $("#isParent").attr('checked', 'checked');
            } else {
                $("#isParent").removeAttr('checked');
            }

            if (data.avaliable == true) {
                $("#avaliable").attr('checked','checked');
            } else {
                $("#avaliable").removeAttr('checked');
            }
            form.render();
        }});
};
$.fn.serializeObject = function () {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function () {
        if (o[this.name]) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
}
function updateType() {
    var body = $("#types").serializeObject();
    if (body.avaliable == null) {
        body.avaliable = 0;
    } else if (body.avaliable === 1) {
        body.avaliable = true;
    }
    if (body.isRoot == null) {
        body.isRoot = 0;
    }
    $.ajax({
        type: "post",
        url: "/admin/types/update",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify($("#types").serializeObject()),
        dataType: "json",
        success: function() {
            layer.msg("修改成功！");
        },
        error: function() {
            layer.msg("网络连接错误，请重试！");
        }

    });
}

//菜单树设置
var zTreeObj;
// zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
var setting = {
    async: {
        enable: true,
        url: "/admin/types/list",
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


//创建菜单树
var types;
// zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
var zNodes = types;

$(document).ready(function(){
    zTreeObj = $.fn.zTree.init($("#typeTree"), setting, zNodes);
});
