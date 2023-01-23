# SpringCaching

## brief explanation
### -- 
### 1. Call Get api (localhost:8080/users/{userId}/profile?userId=A)
### 2. Request goes to Controller first and calls getUserProfile method in UserService.java
### 3. Depending on existence of nameKey in redisTemplate, this method will return cachedName or userInformation from externalApiService(From DB.etc)
