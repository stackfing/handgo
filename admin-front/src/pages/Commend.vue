<template>
    <div id='kill'>
        <head-top :titleItemtest='item'></head-top>
    </div>
    </div>
</template>

<script>
    import HeadTop from '@/components/HeadTop'
    export default {
        components: {
            HeadTop
            // Child
        },
        data() {
            return {
                item: [{
                    title: '推荐',
                    path: '/commend'
                }]
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

<style scoped>
#content{
    padding: 20px;
    /* height: 100% */
}


</style>