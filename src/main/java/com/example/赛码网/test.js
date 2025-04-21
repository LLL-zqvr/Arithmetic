
//给一个对象，实现对象的扁平化js，如：{a:3,b:{c:4,d:[6,6]}}变成{a:3,b.c:4,b.d.0:6,b.d.1:6}
function flattenObject(obj, parentKey = '', result = {}) {
    for (const key in obj) {
        if (obj.hasOwnProperty(key)) {
            const newKey = parentKey ? `${parentKey}.${key}` : key;
            if (typeof obj[key] === 'object' && obj[key]!== null) {
                flattenObject(obj[key], newKey, result);
            } else {
                result[newKey] = obj[key];
            }
        }
    }
    return result;
}

const originalObj = {a: 3, b: {c: 4, d: [6, 6]}};
const flattenedObj = flattenObject(originalObj);
console.log(flattenedObj);
    