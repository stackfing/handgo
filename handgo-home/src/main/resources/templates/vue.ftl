<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/vue"></script>
    <script src="https://cdn.jsdelivr.net/npm/vue-resource@1.3.5"></script>
</head>

<div id="test">{{message}}</div>
<script>
    new Vue({
        el: '#test',
        data: {
            message: ''
        },
        created() {
            this.$http.get('/person/getjson').then(response => {
                // success callback
                this.message = response.status
                alert('asfd')
                alert('aaa')
            }, response => {
                // error callback
                alert('safd');
            });
        }
    });
</script>
</html>