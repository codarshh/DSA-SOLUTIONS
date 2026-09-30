/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const root = new Map();
    const RESULT_KEY = Symbol('result');

    return function(...args) {
        let current = root;

        for (const arg of args) {
            if (!current.has(arg)) {
                current.set(arg, new Map());
            }
            current = current.get(arg);
        }

        if (current.has(RESULT_KEY)) {
            return current.get(RESULT_KEY);
        }

        const res = fn(...args);
        current.set(RESULT_KEY, res);
        return res;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */