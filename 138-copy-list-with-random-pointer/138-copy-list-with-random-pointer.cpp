/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        unordered_map<Node*,Node*> m;
        
        Node* ptr = head;
        Node* ptr2 = new Node(0);
        Node* h = ptr2;
        while(ptr!=NULL){
            Node* n = new Node(ptr->val);
            ptr2->next = n;
            m[ptr] = n;
            ptr2 = ptr2->next;
            ptr = ptr->next;
        }
        
        ptr2 = h->next;
        ptr = head;
        while(ptr2!=NULL){
            ptr2->random = m[ptr->random];
            ptr2 = ptr2->next;
            ptr = ptr->next;
        }
        
        return h->next;
        
    }
};