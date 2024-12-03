#include <iostream>
#include <limits.h>

class Solution {
public:
    int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int digit = x % 10;
            if (ans > INT_MAX / 10 || ans < INT_MIN / 10) {
                return 0; // Return 0 to indicate overflow
            }
            ans = ans * 10 + digit;
            x = x / 10;
        }
        return ans;
    }
};

int main() {
    Solution solution;
    int result = solution.reverse(123);
    std::cout << "Reversed number: " << result << std::endl;
    return 0;
}
