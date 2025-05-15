import React from "react";

export const User1Register = () => {
  return (
    <div className="User1Register">
      <h4>User1 등록</h4>
      <form onSubmit={null}>
        <table border={1}>
          <tr>
            <td>아이디</td>
            <td>
              <input type="text" name="uid" value={null} onChange={null} />
            </td>
          </tr>
          <tr>
            <td>이름</td>
            <td>
              <input type="text" name="name" value={null} onChange={null} />
            </td>
          </tr>
          <tr>
            <td>휴대폰</td>
            <td>
              <input type="text" name="hp" value={null} onChange={null} />
            </td>
          </tr>
          <tr>
            <td>나이</td>
            <td>
              <input type="text" name="age" value={null} onChange={null} />
            </td>
          </tr>
          <tr>
            <td colSpan={2} align="right">
              <input type="submit" value={"등록"} />
            </td>
          </tr>
        </table>
      </form>
    </div>
  );
};
