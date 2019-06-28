#[Github SSH](https://help.github.com/en/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)

> Goto your home ssh folder

```bash
cd ~/.ssh
```

> Generate rsa key pair for git@github.com

```bash
ssh-keygen -t rsa -b 4096 -C "git@github.com"
```

> Replace placeholder `[USER]` with your ubuntu login username 

`
Enter file in which to save the key (/home/[USER]/.ssh/id_rsa):
`

```bash
/home/[USER]/.ssh/id_rsa_gitGithubCom
```

> Add passphrase

`
Enter passphrase (empty for no passphrase):
`

`
Enter same passphrase again: 
`

> Check your generated rsa key pair

```bash 
ls
```
`
id_rsa_git2GithubCom
`

`
id_rsa_git2GithubCom.pub
`

> Open via gedit and copy the contents of rsa pub to clipboard `Ctrl`+`A` then `Ctrl`+`C`

```bash
gedit id_rsa_git2GithubCom.pub
```

> Goto to your [Github Settings > SSH and GPG keys](https://github.com/settings/keys) and click `New SSH key` button

> Enter title "companyName git@github.com" and paste Key `Ctrl`+`V` then click `Add SSH key` button

> Check ssh access to github.com

```bash 
ssh -T git@github.com
```
