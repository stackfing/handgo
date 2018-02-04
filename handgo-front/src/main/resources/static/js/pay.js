new Vue({
    el: '#app',
    data: {
        productNumber: 1,
        singleSum: 0,
        price: 1.9,
        defAddr: '',
        selectedEx: 0
    },
    created: function() {
        this.singleSum = this.price * this.productNumber;
        this.singleSum = this.singleSum.toFixed(2);
    },
    methods: {
        productChange: function(flag) {
            if (flag == 1) {
                this.productNumber ++;
                this.changePridce();
            } else {
                this.productNumber --;
                if (this.productNumber == 0) {
                    this.productNumber = 1;
                }
                this.changePridce();
            }
        },
        changePridce: function() {
            this.singleSum = this.price * this.productNumber;
            this.singleSum = this.singleSum.toFixed(2);
        },
        clickAddr(index) {
            this.defAddr = index;
        },
        changeExpress(index) {
            this.selectedEx = index;
        }
    }
})