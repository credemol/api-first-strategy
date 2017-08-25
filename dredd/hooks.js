var hooks = require('hooks');

/*
hooks.beforeEach(function(transaction, done) {
    console.log("#### Before Each", transaction);
    done();
});
*/
hooks.beforeEachValidation(function(transaction, done) {
    var contentType = transaction.real.headers['content-type'];
    //console.log("#### BefereEachValidation contentType", contentType);

    if(contentType === 'application/json;charset=UTF-8') {
        transaction.real.headers['content-type'] = 'application/json';
    }

    done();
});