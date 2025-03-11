class Solution {
  public:
    vector<int> frequencyCount(vector<int>& arr) {
        int n = arr.size();
        vector<int> v(n + 1, 0);
        for(auto i:arr){
            v[i]++;
        }
        return vector<int>(v.begin() + 1, v.end());
    }
};
