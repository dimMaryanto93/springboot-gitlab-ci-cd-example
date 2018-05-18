# Automation Deployment

Melakukan automation untuk deployment, atau lebih sering disebut continues integration and continues development. Untuk melakukan semua itu ada beberapa teknologi yang kita bisa gunakan seperti berikut:

- GUI Based
    - Jenkins
    - [Jetbraint TeamCity](https://www.jetbrains.com/teamcity)
- Script Based
    - Gitlab CI
    - Github CI
    - Bitbucket

## Run gitlab on docker-compose

Karena saya mau menggunakan `gitlab-ci` jadi saya menggunakan docker untuk menginstall dockernya, run gitlab containernya menggunakan perintah `docker-compose up` setelah installasi gitlab dalam docker container selesai anda bisa masuk ke gitlabnya di link [http://localhost](http://localhost:80) kemudian masukan password untuk root gitlab klo saya pake `adminroot`.

![install gitlab](imgs/intro-gitlab-install.png)

## Buat repository di gitlab

Sama halnya seperti kita mau menggunakan version control sistem seperti github, bitbucket klo kita mau pake hosting version control kita harus buat repositorynya dulu, ok langsung aja buat. Tapi pertama harus login dulu dengan user yang telah kita buat. Setelah itu buat seperti berikut:

![membuat repository](imgs/create-repository.png)

tambahkan remote repository ke project yang telah kita buat seperti berikut:

```bash 
git remote add origin http://localhost/dimasm93/belajar-ci.git
```

Setelah ditambahkan kemudian di push ke remote repository, dengan perintah seperti berikut:

```bash 
git push -u origin master

```

## Jalankan Gitlab Runner


