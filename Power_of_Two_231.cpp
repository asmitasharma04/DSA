#include <iostream>

class Solution {
public:
    bool isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 2 == 1) {
            return false;
        } else {
            return isPowerOfTwo(n / 2);
        }
    }
};

int main() {
    Solution solution;

    // Test cases
    int testCases[] = {1, 2, 3, 4, 16, 18, 32, 64, 100};
    int numberOfTestCases = sizeof(testCases) / sizeof(testCases[0]);

    for (int i = 0; i < numberOfTestCases; ++i) {
        int n = testCases[i];
        bool result = solution.isPowerOfTwo(n);
        std::cout << "Is " << n << " a power of two? " << (result ? "Yes" : "No") << std::endl;
    }

    return 0;
}
