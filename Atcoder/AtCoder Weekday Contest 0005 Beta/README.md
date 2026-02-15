# AtCoder AWC0005

🔗 [Contest Page](https://atcoder.jp/contests/awc0005)

# A - Reward of Multiples

**Time Limit:** 2 sec  
**Memory Limit:** 1024 MiB  
**Score:** 200 points  

---

## 📝 Problem Statement

Takahashi is in charge of accounting at his company and is managing this month's bonus payments to employees.

The company has **N** employees, and each employee has a compensation amount determined by their performance. The compensation amount for the **i-th** employee is **Pᵢ** yen.

The company president gave the following instruction:

> "I would like to give a special allowance to employees whose compensation amount is a multiple of **K**. First, please tell me the total of the compensation amounts for the applicable employees."

Help Takahashi find the total of the compensation amounts for employees whose compensation amount is a multiple of **K** (that is, **Pᵢ** is divisible by **K**).

If there are no such employees, the total is **0**.

---

## 🔒 Constraints

- 1 ≤ N ≤ 2 × 10⁵  
- 1 ≤ K ≤ 10⁹  
- 1 ≤ Pᵢ ≤ 10⁹  
- All inputs are integers  


# B - Updating the Report Card

**Time Limit:** 2 sec  
**Memory Limit:** 1024 MiB  
**Score:** 233 points  

---

## 📝 Problem Statement

Takahashi is managing student grades as the homeroom teacher of a school class.

There are **N** students in the class, numbered from **1 to N**. The initial score of the **i-th** student is **Sᵢ** points.

At the end of the term, it is time to update the report cards. A total of **M updates** are performed.

In the **j-th update**, the score of student **Pⱼ** is changed to **Vⱼ** points.

- The same student may be updated multiple times.
- Each update **overwrites** the previous score.

After all updates are completed, students with a score **strictly less than K points** are required to attend supplementary lessons.

Students with exactly **K points are NOT included**.

Determine how many students must attend supplementary lessons.

---

## 🔒 Constraints

- 1 ≤ N ≤ 10⁵  
- 0 ≤ M ≤ 10⁵  
- 0 ≤ K ≤ 100  
- 0 ≤ Sᵢ ≤ 100  (1 ≤ i ≤ N)  
- 1 ≤ Pⱼ ≤ N   (1 ≤ j ≤ M)  
- 0 ≤ Vⱼ ≤ 100 (1 ≤ j ≤ M)  
- All inputs are integers  

# C - Staircase-Shaped Flower Bed

**Time Limit:** 2 sec  
**Memory Limit:** 1024 MiB  
**Score:** 333 points  

---

## 📝 Problem Statement

Takahashi works as a gardener and is in charge of maintaining a row of flower beds.

There are **N** flower beds, numbered from **1 to N**. Each flower bed **i** currently has **Aᵢ** flowers planted.

A row of flower beds is considered **beautiful** if:

|Bᵢ − Bᵢ₊₁| ≤ K  for all 1 ≤ i ≤ N − 1

where:
- **Bᵢ** is the number of flowers after maintenance.
- Takahashi can **only add flowers**, meaning:
  
  Bᵢ ≥ Aᵢ

He wants to minimize the total number of flowers added:

∑ (Bᵢ − Aᵢ)

It is guaranteed that a solution always exists.

---

## 🔒 Constraints

- 1 ≤ N ≤ 2 × 10⁵  
- 1 ≤ K ≤ 10⁹  
- 1 ≤ Aᵢ ≤ 10⁹  
- All inputs are integers  

---

# D - Splitting Delivery Packages

**Time Limit:** 2 sec  
**Memory Limit:** 1024 MiB  
**Score:** 400 points  

---

## 📝 Problem Statement

Takahashi is in charge of delivery planning at a shipping company.

There are **N packages**, numbered from **1 to N**.  
The weight of package **i** is **Aᵢ**.

He must divide the packages (in order) into **K contiguous segments**, each containing at least one package.

Each segment is assigned to one truck.

The **load** of a truck is the sum of weights of its assigned packages.

Takahashi wants to:

> Maximize the minimum load among the K trucks.

Find the maximum possible value of this minimum load.

---

## 🔒 Constraints

- 1 ≤ K ≤ N ≤ 10⁵  
- 1 ≤ Aᵢ ≤ 10⁹  
- All inputs are integers  

---


