Spring Boot Oauth 2 Demo
==================

Spring OAuth 2.0
----------------------
Oauth2 refresh token api
----------------------------
```java
http://localhost:8080/oauth2/oauth/token?grant_type=password&client_id=ntkteam&client_secret=12345&username=ntkteam&password=password
```

```java
{
 access_token: "f123a754-0d6c-4595-92c8-99b202ea6dd4"
 token_type: "bearer"
 refresh_token: "127068cb-25d1-7d18-1dd8-b29b3157c5d1"
 expires_in: 4
 scope: "read and write"
}
```

Oauth2 access token api
---------------------------
```java
http://localhost:8080/oauth2/oauth/token?grant_type=refresh_token&client_id=ntkteam&refresh_token=127068cb-25d1-7d18-1dd8-b29b3157c5d1&client_secret=12345
```
```java
{
access_token: "v12dd4c6-21c3-573d-a68e-1914ceefc21f"
token_type: "bearer"
refresh_token: "127068cb-25d1-7d18-1dd8-b29b3157c5d1"
expires_in: 4
scope: "read and write"
}
```

Public Api
------------------
http://localhost:8080/oauth2/test/ntkteam?access_token=v12dd4c6-21c3-573d-a68e-1914ceefc21f