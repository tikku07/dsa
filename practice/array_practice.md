# 217. Contains Duplicate

## Point to be noted:
### Summary: HashSet vs ArrayList

To pass the time limit, you need a structure where `.contains()` doesn't need to loop.

| Data Structure | contains() Speed | LeetCode Result |
|----------------|------------------|-----------------|
| ArrayList | O(n) (Slow loop) | TLE ❌ |
| HashSet | O(1) (Instant lookup) | Accepted ✅ |cd ..\..

git add .
git commit -m "Added array practice file"
git push origin main