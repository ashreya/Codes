#include<stdio.h>
#include<string.h>
typedef struct node{
    char s[10];
    int c;
    struct node* left;
    struct node* right;
}node;
node* putnode(node*,char*,int);
void put(char *,int);
node *root=NULL;

node* putnode(node* x,char *s, int c){
    if(x==NULL){
        x=malloc(sizeof(node));
        strcpy(x->s,s);
        x->c=c;
        x->left=NULL;
        x->right=NULL;
        return x;
    }

    else if(strcmp(x->s,s)==1){
            x->left=putnode(x->left,s,c);
    }
    else if(strcmp(x->s,s)==-1){
            x->right=putnode(x->right,s,c);
    }
    else{
            x->c=x->c+1;
    }
    return x;

}

void put(char *s,int c){
    root=putnode(root,s,c);
}

int getnode(node* x,char*s){
    if(x==NULL)
        return -1;
    else{
        if(strcmp(x->s,s)==0){
            return x->c;
        }
        else if(strcmp(x->s,s)==1){
            getnode(x->left,s);
    }
        else if(strcmp(x->s,s)==-1){
            getnode(x->right,s);
    }
    }
}
int get(char *s){
    int z;
    z=getnode(root,s);
}
void main(){
    int c=1;
    put("bc",c);
    put("ab",c);
    put("dc",c);
    put("bc",c);
    printf("%d",get("bc"));
    }
