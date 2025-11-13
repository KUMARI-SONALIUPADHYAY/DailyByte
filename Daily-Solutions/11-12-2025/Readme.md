# 💾 Daily Solutions Archive - Reverse the Array

<div align="center">

![DailyByte](https://img.shields.io/badge/DailyByte-Solutions-green?style=for-the-badge)
![Date](https://img.shields.io/badge/Date-Nov_12_2025-blue?style=for-the-badge)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)

</div>

---

## 📋 Problem: Reverse the Array

**Date:** November 12, 2025  
**Difficulty:** 🟢 Easy  
**Topics:** Arrays & Two Pointers

### Problem Description

Given an integer array `nums`, reverse the array. You should modify the array in-place or return a new reversed array. Reversing an array means that the first element becomes the last, the second element becomes the second-to-last, and so on.

[📖 View Full Problem Statement](../../Daily-Questions/11-12-2025.md)

---

## 📂 Solution Submissions

This folder contains all submitted solutions for the Reverse the Array problem.

### File Naming Convention

```
githubusername_ERPID.extension
```

**Example:** `sayandev731_2024001.py`

---

## ✅ Submission Checklist

Before submitting, ensure your solution includes:

- [ ] **Header Comment Block** with:
  - Problem name: Reverse the Array
  - Date: 11-12-2025
  - Your name and GitHub username
  - ERP ID
  - Approach explanation
  - Time and space complexity analysis

- [ ] **Clean, Well-Documented Code**:
  - Meaningful variable names
  - Proper indentation and formatting
  - Inline comments for complex logic
  - No commented-out code

- [ ] **Correctness**:
  - Handles all test cases correctly
  - Edge cases handled (single element, even/odd length, etc.)
  - No runtime errors

- [ ] **Testing**:
  - Tested with provided examples
  - Additional edge cases verified

---

## 🎯 Expected Approach

### Key Concepts
- Two pointer technique
- In-place array manipulation
- Swapping elements
- Array traversal

### Sample Test Cases
```
Input: [1,2,3,4,5] → Output: [5,4,3,2,1]
Input: [10,20,30] → Output: [30,20,10]
Input: [1] → Output: [1]
Input: [7,7,7,7] → Output: [7,7,7,7]
Input: [-1,-2,-3,-4,-5] → Output: [-5,-4,-3,-2,-1]
```

---

## 📊 Complexity Requirements

- **Time Complexity:** O(n) where n is the length of the array
- **Space Complexity:** O(1) for in-place reversal

---

## 🚀 Submission Instructions

1. **Create Your Solution File**
   - Name it: `your-github-username_your-ERPID.ext`
   - Place it in this folder: `Daily-Solutions/11-12-2025/`

2. **Add Required Header**
   ```python
   """
   Problem: Reverse the Array
   Date: 11-12-2025
   Author: Your Name
   GitHub: @yourusername
   ERP ID: your_erp_id
   
   Approach:
   [Explain your approach here]
   
   Time Complexity: O(?)
   Space Complexity: O(?)
   """
   ```

3. **Create Pull Request**
   - Follow the guidelines in [CONTRIBUTING.md](../../CONTRIBUTING.md)
   - Ensure all checks pass
   - Wait for review

---

## ⚠️ Important Rules

### ✅ DO
- Write your own original solution
- Test thoroughly before submitting
- Document your code well
- Ask for clarification if needed

### ❌ DON'T
- Copy solutions from others or the internet
- Use AI tools to generate solutions
- Submit code you don't understand
- Share your solution before the deadline

---

## 🏆 Evaluation Criteria

Your solution will be evaluated on:

| Criteria | Weight | Description |
|----------|--------|-------------|
| **Correctness** | 40% | Does it work? Handles edge cases? |
| **Code Quality** | 25% | Readable, well-structured, follows conventions |
| **Efficiency** | 20% | Optimal time and space complexity |
| **Documentation** | 10% | Clear comments and explanations |
| **Timeliness** | 5% | Submitted before deadline |

---

## 💡 Tips

- Use two pointers starting from both ends of the array
- Swap elements and move pointers towards the center
- You only need to iterate through half the array
- Stop when left pointer meets or crosses right pointer
- For in-place reversal, you need O(1) extra space
- Test with both even and odd length arrays

---

## 🔗 Quick Links

- [📖 Problem Statement](../../Daily-Questions/11-12-2025.md)
- [📝 Contributing Guidelines](../../CONTRIBUTING.md)
- [🏠 Main README](../../README.md)
- [📚 All Problems](../../Daily-Questions/DailyQuestions.md)

---

## 📞 Need Help?

- **Problem clarification?** Open an issue or comment on the problem
- **Technical issues?** Check the CONTRIBUTING guide
- **General questions?** Ask in discussions

---

<div align="center">

### Happy Coding! 💻

**Deadline:** 24 hours from problem release

---

*Good luck and may your code be bug-free!*

</div>
