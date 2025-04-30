
    //56. 合并区间
    //中等
    //相关标签
    //相关企业
    //以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
    //
    //
    //
    //示例 1：
    //
    //输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
    //输出：[[1,6],[8,10],[15,18]]
    //解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
    //示例 2：
    //
    //输入：intervals = [[1,4],[4,5]]
    //输出：[[1,5]]
    //解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
    /**
     * @param {number[][]} intervals
     * @return {number[][]}
     */
    var merge = function(intervals) {
        intervals.sort((a, b) => a[0] - b[0]);
        // console.log(intervals)
        let news = [];
        let temp = intervals[0];
        for(let i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= temp[1]) {
                temp[0] = Math.min(intervals[i][0], temp[0]);
                temp[1] = Math.max(intervals[i][1],temp[1]);
            } else {
                news.push(Array.from(temp));
                temp = intervals[i];
            }
        }
        news.push(temp);
        return news;
    };
    let intervals = [[1,4],[0,0]];
    let res = merge(intervals);
    console.log(res);
    //执行用时分布
    // 11
    // ms
    // 击败
    // 43.15%
    // 复杂度分析
    // 消耗内存分布
    // 64.82
    // MB
    // 击败
    // 21.27%
    //又是一遍过。孩子们，我入门了