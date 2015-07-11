//
//  Label.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/10/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Sprite.h"

@interface Label : Sprite{
    NSString *text;
}

-(void)draw;

// getter methods
-(NSString*)getText;

// setter methods
-(void)setText:(NSString*)value;

@end
