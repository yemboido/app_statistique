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
    "base64":"WwoJewoJCSJub20iOiAiQmVyb3kiLAoJCSJwcmVub20iOiAiQ2VsaW5lIiwKCQkiYWdlIjogIjI4IiwKCQkicHJvZmVzc2lvbiI6ICJjb21wdGFibGUiLAoJCSJzYWxhaXJlIjogIjM3IgoJfSwKCXsKCQkibm9tIjogIkxlcm95IiwKCQkicHJlbm9tIjogIkJlbiIsCgkJImFnZSI6ICI0OCIsCgkJInByb2Zlc3Npb24iOiAiY29tcHRhYmxlIiwKCQkic2FsYWlyZSI6ICIyNiIKCX0sewoJCSJub20iOiAiQm91YXoiLAoJCSJwcmVub20iOiAiVGVmZiIsCgkJImFnZSI6ICI1MiIsCgkJInByb2Zlc3Npb24iOiAiYm91bGFuZ2VyIiwKCQkic2FsYWlyZSI6ICI0NSIKCX0sewoJCSJub20iOiAiQmFzciIsCgkJInByZW5vbSI6ICJKdWxpZW4iLAoJCSJhZ2UiOiAiNDMiLAoJCSJwcm9mZXNzaW9uIjogInBvbGljaWVyIiwKCQkic2FsYWlyZSI6ICIyNCIKCX0sCgl7CgkJIm5vbSI6ICIiLAoJCSJwcmVub20iOiAiIiwKCQkiYWdlIjogIiIsCgkJInByb2Zlc3Npb24iOiAiIiwKCQkic2FsYWlyZSI6ICIiCgl9LHsKCQkibm9tIjogIkpveSIsCgkJInByZW5vbSI6ICJCcnVubyIsCgkJImFnZSI6ICIyOSIsCgkJInByb2Zlc3Npb24iOiAiY29tcHRhYmxlIiwKCQkic2FsYWlyZSI6ICIzMyIKCX0sewoJCSJub20iOiAiRHVjcm9jIiwKCQkicHJlbm9tIjogIk1hdGhpbGRlIiwKCQkiYWdlIjogIjMyIiwKCQkicHJvZmVzc2lvbiI6ICJpbmZvcm1hdGljaWVuIiwKCQkic2FsYWlyZSI6ICIzOCIKCX0sewoJCSJub20iOiAiWm91cyIsCgkJInByZW5vbSI6ICJBZHJpZW4iLAoJCSJhZ2UiOiAiMjUiLAoJCSJwcm9mZXNzaW9uIjogImluZm9ybWF0aWNpZW4iLAoJCSJzYWxhaXJlIjogIjM1IgoJfSwKCgpd",
    "typeFile": "json"
}
```
