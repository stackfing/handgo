<template>
    <div>
        {{msg}}
    </div>
</template>

<script>
    export default {
        name: 'Child',
        props: ['msg'],
        data() {
            return {
                msg: ''
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