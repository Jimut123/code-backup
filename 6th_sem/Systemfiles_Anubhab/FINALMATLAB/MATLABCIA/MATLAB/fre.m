data=[1,1,1,2,2,2,3,6,3,3,10,3,10];
threshold=1;
transpos = find(diff(data));
transpos1=[transpos, transpos(end)+1];
transvals = data(transpos1);  
transvals(diff([0 transpos1 numel(data)+1])<threshold)=[0];
for k=1:1:10
frequency(k)=length(find(transvals==k));
end