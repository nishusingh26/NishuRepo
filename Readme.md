<h2>Recreate Deployment</h2> 
<li>Version A is terminated then version B is rolled out</li>
<h3>1. First create VPC and Subnet (Public and Private)</h3>

<img width="1326" alt="Screenshot 2024-01-22 at 9 07 55 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/d00a2e86-59b8-48c0-a27c-3fa917e4310a">


<img width="1324" alt="Screenshot 2024-01-22 at 9 08 35 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/e3ca1303-1c6d-4e6a-bac0-24bec515d92b">


<h3>2. Secoundly create Internet Gateway and NAT Gateway</h3>
<img width="1086" alt="Screenshot 2024-01-22 at 10 04 45 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/d4ef586d-03fd-44fc-aebc-12be418e1ae7">

<img width="1315" alt="Screenshot 2024-01-22 at 10 05 35 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/c04e84a3-8512-47ff-981e-62fbbab376da">

<h3>3. You have to create Route table (Public) edit route, add the route from Internet Gateway and associate it with Public Subnet.</h3>
<img width="1357" alt="Screenshot 2024-01-22 at 9 09 21 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/b88a4703-6993-48b3-a7f6-a4408549373f">

<h3>4. You have to create Route table (Private) edit route, add the route from Nat Gateway and associate it with Private Subnet.</h3>
<img width="1081" alt="Screenshot 2024-01-22 at 10 06 47 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/c8373323-24ff-4619-ae8b-c697788d4c81">

<h3>5. We will create 3 servers , One Public (which will be in public subnet and act as a sabastion server ) , two servers (in Private subnet) and install nginx on both. </h3>

<img width="1329" alt="Screenshot 2024-01-22 at 10 12 00 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/8e5dae80-d770-4be3-a853-c6a66afeaa5c">

<img width="1039" alt="Screenshot 2024-01-22 at 10 14 40 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/153bfe43-9b0c-467c-ad75-6ebf60fd4ed0">

<h3>5. Configure index.html file in both the servers and image URL address as mentioned below. </h3>
<img width="1024" alt="Screenshot 2024-01-22 at 10 15 22 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/7e7f37d1-4d16-4159-b640-6198272ede15">

![Uploading Screenshot 2024-01-22 at 10.16.18 PM.png…]()


<h3>6. We will create Load Balancer in 2 AZ's in Public Subnet. Then create Target Group and add our 2 Nginx servers which are in Private Subnet. </h3>



