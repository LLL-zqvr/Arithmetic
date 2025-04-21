const promise = new Promise((resolve, reject) => {
    console.log(1)
    resolve('success')
    console.log(2)
})

promise.then(() => {
    console.log(3)
})
console.dir(promise)
console.log(4)
