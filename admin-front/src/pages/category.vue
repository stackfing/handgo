<template>
    <div>
        <head-top :titleItemtest='item'></head-top>
        <div id="content">
            
        </div>
    </div>
</template>

<script>
    import HeadTop from '@/components/HeadTop'
    import Child from '@/components/Child'
    export default {
        components: {
            HeadTop,
            Child
        },
        data() {
            return {
                item: [{
                    title: '分类',
                    path: '/category'
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