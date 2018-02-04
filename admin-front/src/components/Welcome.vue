<template>
    
</template>

<script>
    export default {
        name: 'Welcome',
        data() {
            return {
                tt: 'asdf'
            }
        },
        methods: {
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            }
        }
    }
</script>