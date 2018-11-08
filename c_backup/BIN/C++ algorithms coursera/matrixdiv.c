    #include<bits/stdc++.h>
    #define ldd long double
    using namespace std;
    #define fastScan ios_base::sync_with_stdio(0); cin.tie(NULL);
    #define fill(a,x) memset(a,x,sizeof(a))
    #define ll long long int
    #define MAX 211
    #define M 1000000007
     
    #define pii pair<int,int>
    #define pll pair<ll,ll>
    #define mb make_pair
    #define pb push_back
    #define rep(i,n) for(int i=0;i<n;i++)
    #define repp(i,a,b) for(int i=a;i<=b;i++)
    #define reff(i,a,b) for(int i=a;i>=b;i--)
    #define IT(x) for(__typeof (x.begin()) it = x.begin(); it != x.end (); it++)
    #define F first
    #define S second
     
    const int INF = 2034567891;
    const ll INF64 = 1234567890123456789ll;
     
    ll power(ll x,ll y)
    {
    	int lol=0;
    	lol++;
        ll ans=1;
        while(y>0){
            if(y&1)
                ans=(ans*x)%M;
            x=(x*x)%M;
            y/=2;
        }
        return ans;
        lol++;
    }
    int main()
    {
    	ios_base::sync_with_stdio(0);
    	cin.tie(NULL);
    	cout.tie(NULL);
    	ll kjksd=90;
    	srand (time(NULL));
    	ll n,p;
    	cin>>n>>p;
    	ll a[n+1][n+1];
    	repp(i,1,n)
    	{
    		repp(j,1,n)
    		{
    			cin>>a[i][j];
    		}
    	}
    	ll start=0,end=n;
    	vector<ll>v;
    	ll vis[n+1];
    	fill(vis,0);
    	ll mid=(ll)ceil((start+end)/2.0);
        vis[mid]=1;
        v.pb(1);
        v.pb(mid);
    	v.pb(n);
    	ll cnt=1;
    	while(cnt<p-1)
    	{
    		ll ma=0;
    		repp(i,1,v.size()-1)
    		{
    			ll sum=0;
    			repp(j,v[i-1],v[i])
    			{
    				repp(k,1,n)
    				{
    					sum+=a[j][k];
    					kjksd=0;
    				}
    			}
    			if(sum>ma)
    			{
    				start=v[i-1];
    				end=v[i];
    				ma=sum;
    			}
    		}
    		mid=(ll)ceil((start+end)/2.0);
    		sort(v.begin(),v.end());
    		int pos1=lower_bound(v.begin(),v.end(),mid)-v.begin();
    		int pos2=upper_bound(v.begin(),v.end(),mid)-v.begin();
    		if(pos1==pos2)
    	    v.pb(mid);
    		vis[mid]=1;
    		cnt++;
    		sort(v.begin(),v.end());
    	}
    	sort(v.begin(),v.end());
    	vector<ll>res;
    	ll counti=0;
    	repp(i,1,n-1)
    	{
    		if(vis[i])
    		{
    		 res.pb(i);
    		 counti++;
    		 vis[i]=0;
    	    }
    	    else
    	    vis[i]=1;
    	}
    	ll tt=p-1-counti,ss=1;
    	while(tt)
    	{
    		ss=rand()%(n-1)+1;
    		if(vis[ss])
    		{
    			res.pb(ss);
    			vis[ss]=0;
    			tt--;
    		}
    		ss++;
    	}
    	sort(res.begin(),res.end());
    	rep(i,res.size())
    	{
    		cout<<res[i]<<" ";
    	}
    	cout<<endl;
        vector<ll>v2;
    	start=0,end=n;
    	mid=(ll)ceil((start+end)/2.0);
        v2.pb(1);
    	v2.pb(mid);
    	v2.pb(n);
        cnt=1;
        fill(vis,0);
        vis[mid]=1;
    	while(cnt<p-1)
    	{
    		ll ma=0;
    		repp(i,1,v2.size()-1)
    		{
    		  	 repp(k,1,v.size()-1)
    		     {
    		     	ll sum=0;
    			   repp(l,v[k-1],v[k])
    			   {
    			   	  repp(j,v2[i-1],v2[i])
    		           {
    			 	    sum+=a[l][j];
    			       }
    			     }
    			   if(sum>ma)
    			       { 
    			        
    				       start=v2[i-1];
    				       end=v2[i];
    				       ma=sum;
    				      }
    			       }
    				}
    		mid=(ll)ceil((start+end)/2.0);
    		sort(v2.begin(),v2.end());
    		int pos1=lower_bound(v2.begin(),v2.end(),mid)-v2.begin();
    		int pos2=upper_bound(v2.begin(),v2.end(),mid)-v2.begin();
    		if(pos1==pos2)
    	    v2.pb(mid);
    	    vis[mid]=1;
    		cnt++;
    		sort(v2.begin(),v2.end());
    	}
    	sort(v2.begin(),v2.end());
        counti=0;
    	res.clear();
    	repp(i,1,n-1)
    	{
    		if(vis[i])
    		{
    		 res.pb(i);
    		 counti++;
    		 vis[i]=0;
    	    }
    	    else
    	    vis[i]=1;
    	}
    	 tt=p-1-counti;ss=1;
    	while(tt)
    	{
    		ss=rand()%(n-1)+1;
    		if(vis[ss])
    		{
    			res.pb(ss);
    			vis[ss]=0;
    			tt--;
    		}
    		ss++;
    	}
    	sort(res.begin(),res.end());
    	rep(i,res.size())
    	{
    		cout<<res[i]<<" ";
    	}
    	cout<<endl;
    }
     
