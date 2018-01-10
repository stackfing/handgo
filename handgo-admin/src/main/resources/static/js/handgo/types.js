var form;
layui.use('form', function(){
    form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
    form.render();
    form.on('switch(switchTest)', function(data){
        console.log(data.elem); //得到checkbox原始DOM对象
        console.log(data.elem.checked); //开关是否开启，true或者false
        console.log(data.value); //开关value值，也可以通过data.elem.value得到
        console.log(data.othis); //得到美化后的DOM对象
    });
});
//菜单点击事件
function zTreeOnClick(event, treeId, treeNode) {
    // alert(treeNode.id);
    // alert("sadf");

    $.ajax({ url: "/admin/types/" + treeNode.id, context: document.body, success: function(data){
            // alert(data.name);
            $("#typeName").attr('value', data.name);
            if (data.parent != null) {
                $("#isParent").removeAttr('checked');
                // $("#isParent").attr('value', '否');
                // $("#isParent").addClass("layui-form-onswitch");
                // $("#isParent").attr('checked','checked');
            } else {
                $("#isParent").attr('checked','checked');
                $("#isParent").attr('value', '是');
            }
            $("#isClosed").attr('value', '是');
            $("#typeId").attr('value', data.id);

            form.render();
        }});
};


//菜单树设置
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


//创建菜单树
var types;
// zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
var zNodes = types;

$(document).ready(function(){
    zTreeObj = $.fn.zTree.init($("#typeTree"), setting, zNodes);
});
