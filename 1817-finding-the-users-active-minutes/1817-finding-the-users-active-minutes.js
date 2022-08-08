var findingUsersActiveMinutes = function(logs, k) {
    
    let map = {}, result = Array(k).fill(0)
    
    for(const [id, time] of logs) {
        
        if(id in map) {
            map[id].add(time)
        } else {
            map[id] = (new Set()).add(time)
        }
    }
    
    for(const id in map) {
        let size = map[id].size
        result[size - 1]++
    }
    
    return result
};