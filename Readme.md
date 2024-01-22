<h2>Recreate Deployment</h2> 
<li>Version A is terminated then version B is rolled out</li>
<h3>1. First create VPC and Subnet (Public and Private)</h3>

<img width="1326" alt="Screenshot 2024-01-22 at 9 07 55 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/d00a2e86-59b8-48c0-a27c-3fa917e4310a">

<img width="1324" alt="Screenshot 2024-01-22 at 9 08 35 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/e3ca1303-1c6d-4e6a-bac0-24bec515d92b">


<h3>2. Secoundly create Internet Gateway and NAT Gateway</h3>

<h3>3. You have to create Route table (Public) edit route, add the route from Internet Gateway and associate it with Public Subnet.</h3>
<img width="1357" alt="Screenshot 2024-01-22 at 9 09 21 PM" src="https://github.com/nishusingh26/NishuRepo/assets/79636190/b88a4703-6993-48b3-a7f6-a4408549373f">

<h3>4. You have to create Route table (Private) edit route, add the route from Nat Gateway and associate it with Private Subnet.</h3>
