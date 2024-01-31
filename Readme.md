## Struce du projet
``` bash
Rapport-Statistique
    src
        main
         java
            app
                rapport
                    statistique
                        config  (fichier des gestions d'erreur http,Api...)

                        domain (fichier de mes interfaces , peut etre comparable au repertoires       (repository))

                        endpoints ( repertoire du rest controller)

                        models ( reportoire des entites )

                        service (repertoire des services , ou j'implemente les mothes du repertoire domaine)

                        DemoApplication (Class principale du projet)
            ressources
                fichiers (contient des fichiers que vous pouvez convertir en base 64 et tester)
                        
```     


# lancé l'application
mvn install && run java 
## Docker
``` bash
docker-compose up -d
```

ou

```bash
docker build -t app:v1 .
docker run -p 8080:8080 app:v1

```

## Make request
pour tester, faire une requete post sur l'url http://localhost:8080/api/statistique/ avec le body
```json
{
    "base64":"W3sKCQkibm9tIjogIkJlcm95IiwKCQkicHJlbm9tIjogIkNlbGluZSIsCgkJImFnZSI6ICIyOCIsCgkJInByb2Zlc3Npb24iOiAiY29tcHRhYmxlIiwKCQkic2FsYWlyZSI6ICIzNyIKCX0sCgl7CgkJIm5vbSI6ICJMZXJveSIsCgkJInByZW5vbSI6ICJCZW4iLAoJCSJhZ2UiOiAiNDgiLAoJCSJwcm9mZXNzaW9uIjogImNvbXB0YWJsZSIsCgkJInNhbGFpcmUiOiAiMjYiCgl9LAoJewoJCSJub20iOiAiQm91YXoiLAoJCSJwcmVub20iOiAiVGVmZiIsCgkJImFnZSI6ICI1MiIsCgkJInByb2Zlc3Npb24iOiAiYm91bGFuZ2VyIiwKCQkic2FsYWlyZSI6ICI0NSIKCX0sCgl7CgkJIm5vbSI6ICJCYXNyIiwKCQkicHJlbm9tIjogIkp1bGllbiIsCgkJImFnZSI6ICI0MyIsCgkJInByb2Zlc3Npb24iOiAicG9saWNpZXIiLAoJCSJzYWxhaXJlIjogIjI0IgoJfSwKCXsKCQkibm9tIjogIkpveSIsCgkJInByZW5vbSI6ICJCcnVubyIsCgkJImFnZSI6ICIyOSIsCgkJInByb2Zlc3Npb24iOiAiY29tcHRhYmxlIiwKCQkic2FsYWlyZSI6ICIzMyIKCX0sCgl7CgkJIm5vbSI6ICJEdWNyb2MiLAoJCSJwcmVub20iOiAiTWF0aGlsZGUiLAoJCSJhZ2UiOiAiMzIiLAoJCSJwcm9mZXNzaW9uIjogImluZm9ybWF0aWNpZW4iLAoJCSJzYWxhaXJlIjogIjM4IgoJfSwKCXsKCQkibm9tIjogIlpvdXMiLAoJCSJwcmVub20iOiAiQWRyaWVuIiwKCQkiYWdlIjogIjI1IiwKCQkicHJvZmVzc2lvbiI6ICJpbmZvcm1hdGljaWVuIiwKCQkic2FsYWlyZSI6ICIzNSIKCX0KXQ==",
    "typeFile": "json"
}
```
