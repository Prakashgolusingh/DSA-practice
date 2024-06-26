# Find missing in second array
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given two arrays <strong>a</strong> of size <strong>n</strong> and <strong>b</strong> of size <strong>m</strong>, the task is to find numbers which are present in the&nbsp;first array, but not present in the second array.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: <br></strong>n = 6, m = 5
a[] = {1, 2, 3, 4, 5, 10}
b[] = {2, 3, 1, 0, 5}
<strong>Output:</strong> <br>4 10
<strong>Explanation</strong>: <br>4 and 10 are present in first array, but not in second array.</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: <br></strong>n = 5, m = 5
a[] = {4, 3, 5, 9, 11}
b[] = {4, 9, 3, 11, 10}</span>
<span style="font-size: 18px;"><strong>Output: <br></strong>5  
<strong>Explanation</strong>: <br>Second array does not contain element 5.
</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>findMissing()</strong> that takes array<strong> a, </strong>array<strong> b, </strong>integer<strong> n, </strong>and integer<strong> m</strong> as parameters and returns an array that contains the missing elements and the order of the elements should be the same as they are in array a.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n+m).<br><strong>Expected Auxiliary Space:</strong> O(m).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n, m ≤ 10<sup>5</sup></span><br><span style="font-size: 18px;">-10<sup>9</sup> ≤ A[i], B[i] ≤ 10<sup>9</sup></span></p></div>
