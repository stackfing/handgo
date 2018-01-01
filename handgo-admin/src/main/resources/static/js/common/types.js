function getTypes() {
    $.get("/admin/types/getTypes", function (data, status) {
        layui.tree({
            elem: '#demo'
            ,nodes: [{ //节点数据
                name: '节点A'
                ,children: [{
                    name: '节点A1'
                }]
            }, {
                name: '节点B'
                ,children: [{
                    name: '节点B1'
                    ,alias: 'bb' //可选
                    ,id: '123' //可选
                }, {
                    name: '节点B2'
                }]
            }]
            ,click: function(node){
                console.log(node) //node即为当前点击的节点数据
            }
        });
    });
}

